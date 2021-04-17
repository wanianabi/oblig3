$(function (){
    visAlleBilletter();
})

function kjopBillett() {
    const billett = {
        film: $("#film").val(),
        antall: $("#antall").val(),
        fornavn: $("#fornavn").val(),
        etternavn: $("#etternavn").val(),
        telefonnr: $("#telefonnr").val(),
        epost: $("#epost").val(),
    };

    const feil = sjekk();

    if (!feil) {

        $.post("/lagre", billett, function() {
            visAlleBilletter();
        });

        $("#film").selectedIndex = 0;
        $("#antall").val("");
        $("#fornavn").val("");
        $("#etternavn").val("");
        $("#telefonnr").val("");
        $("#epost").val("");
    }
}

function visAlleBilletter() {
    $.get("/hentBilletter", function (billetter) {
        output(billetter);
    });
}

function output(billetter) {
    let ut = "<table><tr>" +
        "<th>Film</th><th>Antall</th><th>Fornavn</th><th>Etternavn</th><th>Telefonnr</th><th>Epost</th>" +
        "</tr>";

    for (let i of billetter) {
        ut += "<tr><td>" + i.film + "</td><td>" + i.antall + "</td><td>" + i.fornavn + "</td><td>" + i.etternavn + "</td><td>" +
            i.telefonnr + "</td><td>" + i.epost + "</td></tr>";
        ut += "</td></tr>";
    }
    $("#alleBilletter").html(ut);
}


function slettBilletter() {
    $.get("/slett", function () {
        visAlleBilletter();
    });
}

function sjekk(){

    film = $("#film").val();
    antall = $("#antall").val();
    fornavn =  $("#fornavn").val();
    etternavn = $("#etternavn").val();
    telefonnr = $("#telefonnr").val();
    epost = $("#epost").val();




    let feil = false;

    /*if (filmer.selectedIndex === 0 && antall === "" && fornavn === "" && etternavn === "" && telefonnr === "" && epost === "") {
        $("#antallOut").html("Må velge et antall");
        $("#fornavnOut").html("Må oppgi et fornavn");
        $("#etternavnOut").html("Må oppgi et etternavn");
        $("#telefonnrOut").html("Må oppgi et telefonnr");
        $("#epostOut").html("Må oppgi en epost-adresse");
        $("#filmOut").html("Må velge en film");
        feil = true;
    }*/
    if (film.selectedIndex === 0) {
        $("#filmOut").html("Må velge en film");
        feil = true;
    } if (antall === "") {
        $("#antallOut").html("Må velge et antall");
        feil = true;
    } if(fornavn ===""){
        $("#fornavnOut").html("Må oppgi et fornavn");
        feil = true;
    } if (etternavn === "") {
        $("#etternavnOut").html("Må oppgi et etternavn");
        feil = true;
    } if (telefonnr === "") {
        $("#telefonnrOut").html("Må oppgi et telefonnr");
        feil = true;
    } if (epost === "") {
        $("#epostOut").html("Må oppgi en epost-adresse");
        feil = true;
    }
    return feil;
}
