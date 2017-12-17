package ${package}.authentication;

import se.curity.identityserver.sdk.web.Request;

class CallbackRequestModel {
    private String _code;
    private String _state;
    private Request _request;

    CallbackRequestModel(Request request) {
        _code = request.getParameterValueOrError("code");
        _state = request.getParameterValueOrError("state");
        _request = request;
    }

    public String getCode() {
        return _code;
    }

    public String getState() {
        return _state;
    }

    public Request getRequest() {
        return _request;
    }
}