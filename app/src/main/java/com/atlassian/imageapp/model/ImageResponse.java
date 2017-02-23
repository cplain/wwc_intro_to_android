package com.atlassian.imageapp.model;

import java.util.List;

public class ImageResponse {

    private final boolean success;
    private final int status;
    private final List<Image> data;

    public ImageResponse(boolean success, int status, List<Image> data) {
        this.success = success;
        this.status = status;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getStatus() {
        return status;
    }

    public List<Image> getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ImageResponse imageResponse = (ImageResponse) o;

        if (success != imageResponse.success) {
            return false;
        }
        if (status != imageResponse.status) {
            return false;
        }
        return data != null ? data.equals(imageResponse.data) : imageResponse.data == null;

    }

    @Override
    public int hashCode() {
        int result = (success ? 1 : 0);
        result = 31 * result + status;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ImageResponse{" +
                "success=" + success +
                ", status=" + status +
                ", data=" + data +
                '}';
    }
}
