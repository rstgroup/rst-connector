package com.rstit.connector.ui.chat

import com.rstit.connector.ui.base.MultiViewAdapter

/**
 * @author Tomasz Trybala
 * @since 2017-07-24
 */
interface ChatViewAccess {
    fun notifyDataSetChanged()

    fun closeKeyboard()

    val adapter: MultiViewAdapter

    fun clearScrollListener()

    fun setScrollListenerEnabled(enabled: Boolean)
}