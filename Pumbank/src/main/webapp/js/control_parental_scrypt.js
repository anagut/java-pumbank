function generarHtml(paramElemid, paramBloq) {
    $(paramElemid).html(function () {
        let htmlBloq = '';
        paramBloq.forEach(unBloq => {
            htmlBloq += `<li>
            <div>${unBloq.url}</div>  
       
            </li>`;
        });

        return htmlBloq;
    });
}


function addBloqHtml(paramElemid, unBloq) {
    let htmlBloq = `<li>
    <div>${unBloq.url}</div>       
    </li>`;


    $(paramElemid).append(htmlBloq);
    asociaClick(paramElemid+'.borrar');
    
    //append es para añadir en el cuerpo, no para sustituirlo
    //tendria que añadirse en el asociaclick el parametro que le hemos dado a la funcion para poder usar otro array en el cual incluir un nuevo amigo

}

$('#cargarbtn').click(function (evnt) {
    evnt.preventDefault();

    document.querySelectorAll('.error').forEach(elem => {
        elem.classList.add('esconder');
    });

    let formValid = document.getElementById('addForm').checkValidity();

    if (formValid) {
        let newUrl = {
            url: document.getElementById('url').value,
        };

        //ENVIAR
        $.ajax({
            method: "POST",
            url: "http://www.mocky.io/v2/5bd9731d2f00005e0006d11d",//caso true
            // url: "http://www.mocky.io/v2/5bd9777d2f0000790006d14c",//caso false
            data: newUrl
        }).done(function (data) {
            console.log(data);
            if (data.result) {
                addBloqHtml('#bloqueados', newUrl);
                //aqui se puede comprobar donde queremos añadirlo, poniendo entre parentesis el id del bloque.

                //el done indica 

            } else {
                //mensaje de error
                document.getElementById('servererr').classList.remove('esconder');
            }
        });

    } else {

        if (!document.getElementById('url').checkValidity()) {
            document.getElementById('urlerror').classList.remove('esconder');
        }

    }

});