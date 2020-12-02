import com.ooyala.flex.model.asset.create.NewAssetPlaceholder
import com.ooyala.flex.sdk.FlexSdkClient
import com.ooyala.flex.sdk.services.enterprise.AssetService
import spock.lang.Specification


class CreateNewAssetScriptTest extends Specification {

    def "new asset creation"() {

        FlexSdkClient flexSdkClient = Mock(FlexSdkClient)
        AssetService assetService = Mock(AssetService)
        CreateNewAssetScript target = new CreateNewAssetScript()

        given:
        flexSdkClient.getAssetService() >> assetService
        target.setFlexSdkClient(flexSdkClient)

        when:
        target.execute()

        then:
        1 * assetService.createAsset(_ as NewAssetPlaceholder)

    }

}
