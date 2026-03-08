package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BookPlus: ImageVector
    get() {
        if (_BookPlus != null) {
            return _BookPlus!!
        }
        _BookPlus = ImageVector.Builder(
            name = "Filled.BookPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.4f, 2.25f)
                horizontalLineTo(8.17f)
                curveToRelative(-0.534f, 0f, -0.98f, 0f, -1.345f, 0.03f)
                curveToRelative(-0.38f, 0.03f, -0.736f, 0.098f, -1.074f, 0.27f)
                curveToRelative(-0.82f, 0.417f, -1.204f, 1.088f, -1.37f, 1.78f)
                curveToRelative(-0.137f, 0.566f, -0.134f, 1.189f, -0.132f, 1.687f)
                lineToRelative(0.001f, 0.183f)
                verticalLineToRelative(14.05f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
                horizontalLineToRelative(10.652f)
                curveToRelative(0.617f, 0f, 1.28f, -0.086f, 1.756f, -0.548f)
                curveToRelative(0.484f, -0.467f, 0.592f, -1.137f, 0.592f, -1.802f)
                verticalLineToRelative(-0.908f)
                arcToRelative(1.65f, 1.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.65f, -0.583f)
                curveToRelative(0.278f, -0.432f, 0.35f, -0.966f, 0.35f, -1.509f)
                verticalLineTo(4.6f)
                curveToRelative(0f, -0.616f, -0.086f, -1.28f, -0.547f, -1.757f)
                curveToRelative(-0.467f, -0.484f, -1.136f, -0.593f, -1.803f, -0.593f)
                moveToRelative(-0.998f, 18f)
                horizontalLineTo(5.75f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -1.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(0.65f)
                curveToRelative(0f, 0.57f, -0.11f, 0.7f, -0.134f, 0.724f)
                curveToRelative(-0.031f, 0.03f, -0.167f, 0.126f, -0.714f, 0.126f)
                moveTo(12.75f, 7.5f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-1.75f)
                horizontalLineTo(9.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.75f)
                verticalLineTo(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
            }
        }.build()

        return _BookPlus!!
    }

@Suppress("ObjectPropertyName")
private var _BookPlus: ImageVector? = null
