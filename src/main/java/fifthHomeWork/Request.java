package fifthHomeWork;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Request<T> {
    private List<T> content;
    private int limit;
    private int offset;
    private int total;

    public Request(int limit, int offset, int total) {
        this.limit = limit;
        this.offset = offset;
        this.total = total;
        this.content = new ArrayList<>();
    }

    public int getLimit() {
        return limit;
    }

    public int getOffset() {
        return offset;
    }

    public int getTotal() {
        return total;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void putContent(List<T> data) {
        this.content.addAll(data);
    }

    public List<T> getContent() {
        return content;
    }

    public Iterable<Object> getAllContent() {
        return Collections.singleton(content);
    }
}