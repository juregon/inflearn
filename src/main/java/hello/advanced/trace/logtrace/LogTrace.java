package hello.advanced.trace.logtrace;

import hello.advanced.trace.TraceStatus;

/**
 * hello.advanced.trace.logtrace
 *
 * @DATE 2024-05-11
 * @Author juregon2
 * @Version 1.0
 */
public interface LogTrace {
    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);
}
