package net.rafaeltoledo.dagger.data.domain;

import java.util.List;

public class BaseResponse<T> {

    private final int pagelen;
    private final int page;
    private final int size;
    private final List<T> values;

    public BaseResponse(int pagelen, int page, int size, List<T> values) {
        this.pagelen = pagelen;
        this.page = page;
        this.size = size;
        this.values = values;
    }

    public int getPagelen() {
        return pagelen;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public List<T> getValues() {
        return values;
    }
}
