import com.ooyala.flex.plugins.GroovyScriptContext
import com.ooyala.flex.plugins.actions.impl.message.http.response.HttpResponse
import com.ooyala.flex.plugins.actions.lock.ScriptingLockManager
import com.ooyala.flex.sdk.FlexSdkClient
import tv.nativ.mio.metadata.visitor.provider.FlexObjectReference

def execute(FlexSdkClient flexSdkClient, GroovyScriptContext context, ScriptingLockManager lockManager,
            List<FlexObjectReference> objectRefs, HttpResponse obj) {
    return "true"
}