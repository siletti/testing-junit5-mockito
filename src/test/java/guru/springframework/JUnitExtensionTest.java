package guru.springframework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class JUnitExtensionTest {
    @Mock
    Map<String, Object> mapMock;

    @Test
    void TestingMock() {
        assertEquals(mapMock.size(), 0);
        mapMock.put("key", "value");
        mapMock.put("key2", "value2");
        mapMock.forEach((key, value) -> System.out.println(key + ":" + value));
        assertEquals(mapMock.size(), 0);
    }

}
