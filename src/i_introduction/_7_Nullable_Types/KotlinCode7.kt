package i_introduction._7_Nullable_Types

import util.JavaCode

class KotlinCode7 : JavaCode() {

    fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
        if(client?.personalInfo?.email != null && message != null) {
            mailer.sendMessage(client.personalInfo.email, message)
        }
    }

}