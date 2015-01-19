angular.module('membersService', ['ngResource']).
    factory('Members', function($resource){
  return $resource('/rest/service/sayHello:name', {});
});