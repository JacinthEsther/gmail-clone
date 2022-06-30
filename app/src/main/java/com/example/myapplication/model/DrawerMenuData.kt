package com.example.myapplication.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(
    val icon: ImageVector? = null,
    val title: String? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean = false,
){
    object AllInboxes: DrawerMenuData(
        icon= Icons.Outlined.AllInbox,"All inboxes"
    )

    object Primary: DrawerMenuData(
        icon= Icons.Outlined.Inbox,"Primary"
    )

    object Social: DrawerMenuData(
        icon= Icons.Outlined.CalendarToday,"Social"
    )
     object Promotions: DrawerMenuData(
        icon= Icons.Outlined.Tag,"Promotions"
    )
     object Starred: DrawerMenuData(
        icon= Icons.Outlined.StarOutline,"Starred"
    )


 object Snoozed: DrawerMenuData(
        icon= Icons.Outlined.Snooze,"Snoozed"
    )
 object Important: DrawerMenuData(
        icon= Icons.Outlined.Label,"Important"
    )
 object Sent: DrawerMenuData(
        icon= Icons.Outlined.Send,"Sent"
    )
 object Schedule: DrawerMenuData(
        icon= Icons.Outlined.Schedule,"Scheduled"
    )


    object Outbox: DrawerMenuData(
        icon= Icons.Outlined.Outbox,"Outbox"
    )

    object Draft: DrawerMenuData(
        icon= Icons.Outlined.Drafts,"Drafts"
    )

    object AllMail: DrawerMenuData(
        icon= Icons.Outlined.Mail,"All Mail"
    )

    object Calendar: DrawerMenuData(
        icon= Icons.Outlined.Person,"Calendar"
    )

    object Contacts: DrawerMenuData(
        icon= Icons.Outlined.Contacts,"Contacts"
    )

    object Setting: DrawerMenuData(
        icon= Icons.Outlined.Settings,"Settings"
    )

    object Help: DrawerMenuData(
        icon= Icons.Outlined.Help,"Help & FeedBack"
    )

    object Divider : DrawerMenuData(
        isDivider = true
    )

    object HeaderOne: DrawerMenuData(
        isHeader = true,
        title = "ALL LABELS"
    )
    object HeaderTwo: DrawerMenuData(
        isHeader = true,
        title = "GOOGLE APPS"
    )
}