package com.flex

import com.ooyala.flex.model.asset.create.NewAssetPlaceholder
import com.ooyala.flex.plugins.PluginCommand

class CreateNewAssetScript extends PluginCommand {

    @Override
    Object execute() {

        def assetService = flexSdkClient.getAssetService()

        NewAssetPlaceholder asset = NewAssetPlaceholder.builder()
                .type("media-asset")
                .name("demo asset")
                .build()

        assetService.createAsset(asset)

    }

}
