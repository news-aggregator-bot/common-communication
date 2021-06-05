package bepicky.common;


import bepicky.common.domain.response.ErrorResponse;

public class ErrorUtil {

    public static final String LANGUAGE = "language";
    public static final String CATEGORY = "category";
    public static final String SOURCE = "source";
    public static final String SOURCE_PAGE = "source page";
    public static final String READER = "reader";
    public static final String TAG = "tag";

    private ErrorUtil() {}

    public static ErrorResponse languageNotFound() {
        return new ErrorResponse(404, LANGUAGE);
    }

    public static ErrorResponse categoryNotFound() {
        return new ErrorResponse(404, CATEGORY);
    }

    public static ErrorResponse sourcePageNotFound() {
        return new ErrorResponse(404, SOURCE_PAGE);
    }

    public static ErrorResponse sourceNotFound() {
        return new ErrorResponse(404, SOURCE);
    }

    public static ErrorResponse readerNotFound() {
        return new ErrorResponse(404, READER);
    }

    public static ErrorResponse tagNotFound() {
        return new ErrorResponse(404, TAG);
    }

    public static ErrorResponse tagLimit() {
        return new ErrorResponse(403, TAG);
    }

}
