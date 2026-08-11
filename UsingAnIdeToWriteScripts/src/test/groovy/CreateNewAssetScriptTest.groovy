import com.ooyala.flex.model.asset.create.NewAssetPlaceholder
import com.ooyala.flex.sdk.FlexSdkClient
import com.ooyala.flex.sdk.services.enterprise.AssetService
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension

import static org.mockito.ArgumentMatchers.any
import static org.mockito.Mockito.verify
import static org.mockito.Mockito.when

@ExtendWith(MockitoExtension.class)
class CreateNewAssetScriptTest {

    @Mock
    FlexSdkClient flexSdkClient

    @Mock
    AssetService assetService

    @Test
    void createsNewAsset() {
        when(flexSdkClient.getAssetService()).thenReturn(assetService)

        def target = new CreateNewAssetScript()
        target.flexSdkClient = flexSdkClient

        target.execute()

        verify(assetService).createAsset(any(NewAssetPlaceholder.class))
    }
}
