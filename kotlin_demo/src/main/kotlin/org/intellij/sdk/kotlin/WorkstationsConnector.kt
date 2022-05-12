package org.intellij.sdk.kotlin

import com.intellij.icons.AllIcons
import com.intellij.ui.components.ActionLink
import com.jetbrains.gateway.api.GatewayConnector
import com.jetbrains.gateway.api.GatewayConnectorView
import com.jetbrains.gateway.api.GatewayRecentConnections
import com.jetbrains.rd.util.lifetime.Lifetime
import java.awt.Component
import javax.swing.Icon
import javax.swing.JComponent
import javax.swing.JPanel

class WorkstationsConnector: GatewayConnector {
    override val icon: Icon
        get() = AllIcons.General.Balloon

    override fun createView(lifetime: Lifetime): GatewayConnectorView {
        return object: GatewayConnectorView {
            override val component: JComponent = JPanel()
        }
    }

    override fun getActionText(): String {
        return "action text"
    }

    override fun getDescription(): String? {
        return "description"
    }

    override fun getDocumentationLink(): ActionLink? {
        return null
    }

    override fun getTitle(): String {
        return "title"
    }

    override fun getTitleAdornment(): JComponent? {
        return null
    }

    override fun isAvailable(): Boolean {
        return true
    }

    override fun getConnectorId(): String {
        return "foo"
    }

    override fun getRecentConnections(setContentCallback: (Component) -> Unit): GatewayRecentConnections? {
        return null
    }

    override fun initProcedure() {
        super.initProcedure()
    }
}