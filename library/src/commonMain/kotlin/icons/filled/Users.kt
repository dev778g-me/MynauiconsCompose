package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Users: ImageVector
    get() {
        if (_Users != null) {
            return _Users!!
        }
        _Users = ImageVector.Builder(
            name = "Filled.Users",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 13f)
                curveToRelative(-1.915f, 0f, -3.603f, 0.965f, -4.792f, 2.245f)
                curveToRelative(-1.182f, 1.273f, -1.958f, 2.948f, -1.958f, 4.505f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                curveToRelative(0f, -1.558f, -0.775f, -3.232f, -1.958f, -4.505f)
                curveTo(12.602f, 13.965f, 10.915f, 13f, 9f, 13f)
                moveToRelative(8.204f, 0.301f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.408f, 1.444f)
                curveToRelative(0.933f, 0.264f, 1.801f, 1.019f, 2.45f, 2.014f)
                curveToRelative(0.647f, 0.995f, 1.004f, 2.122f, 1.004f, 2.99f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -1.22f, -0.478f, -2.627f, -1.248f, -3.808f)
                curveToRelative(-0.769f, -1.181f, -1.9f, -2.244f, -3.298f, -2.64f)
                moveTo(9f, 3.5f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 11f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -7.5f)
                moveToRelative(6f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -7.5f)
            }
        }.build()

        return _Users!!
    }

@Suppress("ObjectPropertyName")
private var _Users: ImageVector? = null
