import com.ooyala.flex.jobexecutor.dto.FlexObjectReference
import com.ooyala.flex.plugins.GroovyScriptContext
import com.ooyala.flex.sdk.FlexSdkClient
import com.ooyala.flex.plugins.actions.lock.ScriptingLockManager


def execute(FlexSdkClient flexSdkClient, GroovyScriptContext context, ScriptingLockManager lockManager,
            List<FlexObjectReference> objectRefs) {
    return "true"
}