import com.ooyala.flex.model.asset.create.NewAssetPlaceholder
import com.ooyala.flex.plugins.GroovyScriptContext
import com.ooyala.flex.sdk.FlexSdkClient


def execute(FlexSdkClient flexSdkClient, GroovyScriptContext context) {

    def assetService = flexSdkClient.getAssetService()

    NewAssetPlaceholder asset = NewAssetPlaceholder.builder()
            .type("media-asset")
            .name("demo asset")
            .build()

    assetService.createAsset(asset)

}

