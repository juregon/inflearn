package hello.advanced.trace;

import java.util.UUID;

/**
 * hello.advanced.trace
 *
 * @DATE 2024-05-11
 * @Author juregon2
 * @Version 1.0
 */
public class TraceId {
    private String id;
    private int level;

    public TraceId() {
        this.id  = createId();
        this.level = 0;
    }

    private TraceId(String id, int level) {
        this.id = id;
        this.level = level;
    }

    private String createId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    public TraceId createNextId() {
        return new TraceId(id, level + 1);
    }

    public TraceId createPreviousId() {
        return new TraceId(id, level - 1);
    }

    public boolean isFirstLevel() {
        return level == 0;
    }

    public String getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }
}
