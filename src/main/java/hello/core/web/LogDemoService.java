package hello.core.web;

import hello.core.common.MyLogger;
import jakarta.inject.Provider;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {
//    private final ObjectProvider<MyLogger> myLoggerObjectProvider;
//    private final Provider<MyLogger> myLoggerProvider;
    private final MyLogger myLogger;
    public void logic(String id) {
//        MyLogger myLogger = myLoggerObjectProvider.getObject();
//        MyLogger myLogger = myLoggerProvider.get();
        myLogger.log("service id" + id);
    }
}
