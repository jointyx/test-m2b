# Mobile2b Web Function SDK

This is an easy-to-use Java SDK to create Web Functions for the Mobile2b platform.

To start, let's define `{YOUR_BASE_URL}` as the Base URL of your server where you run the Web Functions and let's
define `{WF_PATH}` as the relative path of a specific Web Function on this server.

A Web Function must have two endpoints.

`POST {YOUR_BASE_URL}/{WF_PATH}` This is the endpoint that gets called when the Web Function is executed

`GET {YOUR_BASE_URL}/{WF_PATH}/doc` This is the endpoint that gets called to retreive a basic documentation of your Web
Function.

Please check out the demo implementation for further details or shoot us an email at support@mobile2b.com.