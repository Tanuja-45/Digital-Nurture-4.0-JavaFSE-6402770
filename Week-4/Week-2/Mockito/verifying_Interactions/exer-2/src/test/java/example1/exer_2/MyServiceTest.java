package example1.exer_2;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
//import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Call method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 4: Verify interaction
        verify(mockApi).getData();
    }
}
