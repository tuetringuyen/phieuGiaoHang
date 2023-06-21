app = angular.module("admin-app",["ngRoute"]);
app.config(function($routeProvider){
	 
    $routeProvider
    .when("/delivery",{
        templateUrl: "/assets/js/list.html",
        controller: "delivery-note-ctrl"
    })
    .when("/delivery-create",{
        templateUrl: "/assets/js/create.html",
        controller: "delivery-note-ctrl"
    })
    .when("/authorize",{
        templateUrl: "/assets/admin/authority/index.html",
        controller: "authority-ctrl"
    })
    .when("/unauthorized",{
        templateUrl: "/assets/admin/authority/unauthorized.html",
        controller: "authority-ctrl"
    })
    .otherwise({
        template: "<h1 class='text-center'>FPT Polytechnic Administration</h1>"
    });
})