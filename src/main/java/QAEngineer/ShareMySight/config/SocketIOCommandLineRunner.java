package QAEngineer.ShareMySight.config;

import com.corundumstudio.socketio.SocketIOServer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SocketIOCommandLineRunner implements CommandLineRunner {
  private final SocketIOServer socketIOServer;
  
  @Override
  public void run(String... args) throws Exception {
    socketIOServer.start();
  }
}
