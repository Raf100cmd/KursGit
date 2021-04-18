var postId = pm.response.json().id;

pm.environment.set("postId", postId);
console.log("Stworzono nowego posta z id" + postId);

pm.test("Status code is 201", function () {
    pm.response.to.have.status(201);
});

