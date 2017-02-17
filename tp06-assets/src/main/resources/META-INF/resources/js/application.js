var angularApp = angular.module('tp06', ['ui.calendar', 'ngResource']);

angularApp.factory('EvenementsWS', ['$resource', function ($resource) {
    return $resource('api/evenements/:id', null,
        {
            'update': {method: 'PUT'}
        });
}]);


