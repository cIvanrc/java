function validarForma(forma){
    var usuario = forma.usuario;
    var usuarioValue = forma.usuario.value;
    if(usuarioValue == "" || usuarioValue == "Escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = forma.password;
    var passwordValue = forma.password.value;
    if(passwordValue == "" || passwordValue.length < 3){
        alert("La password debe ser de al menos tres caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked)
            checkSeleccionado = true;
        
    }
    
    if(!checkSeleccionado){
        alert("Debe seleccionar al menos una tecnologia")
        return false;
    }
    
    //validacion genero
    var generos = forma.genero;
    var radioSeleccionado = false;
    
    for (var i = 0; i < generos.length; i++) {
        if(generos[i].checked)
            radioSeleccionado = true;
    }
    
    if(!radioSeleccionado){
        alert("Debe seleccionar un genero")
        return false;
    }
    
    var ocupacion = forma.ocupacion.value;
    if(ocupacion == ""){
        alert("Debe seleccionar una ocupacion")
        return false;
    }    
    
    alert("Formulario valido, enviando datos...");
        
    
}