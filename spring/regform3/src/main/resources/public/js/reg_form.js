angular.module("registration_form", [])
.controller("AppCtrl", function ($scope, $http) {
  $scope.auth = {};
  $scope.sendForm = function (auth) {
    $http({
      method: "POST",
      url: "/api/reg_form",
      data: $.param(auth),
      headers: {"Content-Type": "application/x-www-form-urlencoded"}
    }).then(
        function (data) {
          window.alert("success");
        },
        function (error) {
          window.alert("fail");
        }
    );
  }
});