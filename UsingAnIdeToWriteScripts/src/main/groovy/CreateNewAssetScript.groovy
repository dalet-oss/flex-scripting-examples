import com.ooyala.flex.model.asset.create.NewAssetPlaceholder
import com.ooyala.flex.plugins.GroovyScriptContext
import com.ooyala.flex.plugins.PluginCommand
import com.ooyala.flex.sdk.FlexSdkClient

class CreateNewAssetScript {

    GroovyScriptContext context;
    FlexSdkClient flexSdkClient;

    // Copy and past the execute method from here into the Flex scripting action configuration
    def execute() {

        def assetService = flexSdkClient.getAssetService()

        NewAssetPlaceholder asset = NewAssetPlaceholder.builder()
                .type("media-asset")
                .name("demo asset")
                .build()

        assetService.createAsset(asset)

    }

}
