package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnnotationMocksTest {

    @Mock
    Map<String, Object> mapMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void TestingMock() {
        assertEquals(mapMock.size(), 0);
        mapMock.put("key", "value");
        mapMock.put("key2", "value2");
        mapMock.forEach((key, value) -> System.out.println(key + ":" + value));
        assertEquals(mapMock.size(), 0);
    }
}
