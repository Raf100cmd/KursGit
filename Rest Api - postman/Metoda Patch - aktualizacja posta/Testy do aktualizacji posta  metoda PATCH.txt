// Metoda PATCH aktualizuje fragment posta - czyli nadpisuje nowe zmiany, które zmieniają tylko to co chcemy zmienić, beż zmiany innych danych 
// posta, który został napisany wcześniej

pm.test("Sprawdź autora - czy zmienił się autor postu", function () {
    var jsonData = pm.response.json();   
    pm.expect(jsonData.author).to.eql("tester Floyd Greenholt");
});

pm.test("Sprawdź autora", function () {
    var jsonData = pm.response.json();   
    pm.expect(jsonData.author).to.eql("tester Wojciech Karol Szymanowski");
});

pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});

pm.test("Sprawdź czy w poście znajduje się odpowiednie słowo", function () {
    pm.expect(pm.response.text()).to.include("Szymanowski");
}); // szuka danego słowa w tekscie posta

pm.test("Sprawdź tytuł", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.title).to.eql("18937 Angelita Circles");
}); // szuka w tytule odpowiednią nazwę 

pm.test("Sprawdź tytuł i autora", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.title).to.eql("18937 Angelita Circles");
    pm.expect(jsonData.author).to.eql("tester Wojciech Karol Szymanowski");
});

pm.test("Sprawdź czy w poście znajduje się odpowiednie słowo", function () {
    pm.expect(pm.response.text()).to.include("Angelita");
}); // szuka danego słowa w tekscie posta

pm.test("Sprawdź czy w poście znajduje się odpowiednie słowo", function () {
    pm.expect(pm.response.text()).to.include("Karol");
}); // szuka danego słowa w tekscie posta