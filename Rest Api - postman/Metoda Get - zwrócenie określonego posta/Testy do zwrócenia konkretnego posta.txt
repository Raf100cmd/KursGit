pm.test("Sprawdz czy w poscie znajduje sie odpowiednie slowo", function () {
    pm.expect(pm.response.text()).to.include("Harber");
}); // szuka danego słowa w tekscie posta

pm.test("Sprawdź tytuł", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.title).to.eql("0068 Harber Groves");
}); // szuka w tytule odpowiednią nazwę 


pm.test("Sprawdź tytuł i autora", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.title).to.eql("0068 Harber Groves");
    pm.expect(jsonData.author).to.eql("tester Maude Gerhold");
});

pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});