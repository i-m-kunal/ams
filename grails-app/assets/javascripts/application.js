// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better 
// to create separate JavaScript files as needed.
//
//= require jquery.min.js
//= require angular/angular.js
//= require angular/angular-resource.js
//= require angular/angular-route.js
//= require bootstrap/bootstrap.min.js
//= require angular/angular-ui-router.min.js
//= require app.js
//= require_self




if (typeof jQuery !== 'undefined') {
    (function ($) {
        $('#spinner').ajaxStart(function () {
            $(this).fadeIn();
        }).ajaxStop(function () {
            $(this).fadeOut();
        });
    })(jQuery);
}
