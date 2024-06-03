import com.ooyala.flex.jobexecutor.dto.FlexObjectReference
import com.ooyala.flex.model.asset.create.NewAssetPlaceholder
import com.ooyala.flex.plugins.GroovyScriptContext
import com.ooyala.flex.plugins.actions.lock.ScriptingLockManager
import com.ooyala.flex.sdk.FlexSdkClient


def execute(List<FlexObjectReference> objectRefs, FlexSdkClient sdkClient, GroovyScriptContext context,
            ScriptingLockManager lockManager) {

    def assetService = sdkClient.getAssetService()

    def asset = NewAssetPlaceholder.builder()
            .type("media-asset")
            .name("demo asset")
            .build()

    assetService.createAsset(asset)

}
