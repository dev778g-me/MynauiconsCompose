package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BookUser: ImageVector
    get() {
        if (_BookUser != null) {
            return _BookUser!!
        }
        _BookUser = ImageVector.Builder(
            name = "Filled.BookUser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.75f, 9f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0f)
            }
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
                moveTo(12f, 6.25f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.01f, 4.627f)
                quadToRelative(0.286f, 0.164f, 0.54f, 0.382f)
                curveToRelative(0.734f, 0.629f, 1.2f, 1.563f, 1.2f, 2.741f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -0.752f, -0.284f, -1.266f, -0.676f, -1.603f)
                curveToRelative(-0.408f, -0.35f, -0.977f, -0.543f, -1.574f, -0.543f)
                reflectiveCurveToRelative(-1.166f, 0.193f, -1.574f, 0.543f)
                curveToRelative(-0.392f, 0.337f, -0.676f, 0.85f, -0.676f, 1.603f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -1.178f, 0.466f, -2.112f, 1.2f, -2.741f)
                quadToRelative(0.254f, -0.219f, 0.54f, -0.382f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6.25f)
            }
        }.build()

        return _BookUser!!
    }

@Suppress("ObjectPropertyName")
private var _BookUser: ImageVector? = null
