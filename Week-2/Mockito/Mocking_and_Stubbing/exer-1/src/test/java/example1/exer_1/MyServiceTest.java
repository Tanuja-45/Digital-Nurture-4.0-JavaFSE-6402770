package example1.exer_1;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Mock the ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");
        // Inject into service
        MyService service = new MyService(mockApi);
        // Call method and assert
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
