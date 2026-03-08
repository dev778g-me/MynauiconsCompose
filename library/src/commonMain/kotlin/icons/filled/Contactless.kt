package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Contactless: ImageVector
    get() {
        if (_Contactless != null) {
            return _Contactless!!
        }
        _Contactless = ImageVector.Builder(
            name = "Filled.Contactless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.125f, 2.33f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.006f, 0.335f)
                curveTo(19.506f, 5.415f, 20.25f, 8.652f, 20.25f, 12f)
                curveToRelative(0f, 3.355f, -0.746f, 6.465f, -2.113f, 9.324f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.354f, -0.648f)
                arcTo(19.9f, 19.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.75f, 12f)
                curveToRelative(0f, -3.132f, -0.697f, -6.136f, -1.96f, -8.665f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.335f, -1.006f)
                moveToRelative(-4.29f, 1.905f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.99f, 0.38f)
                curveTo(14.823f, 6.86f, 15.45f, 9.484f, 15.45f, 12f)
                curveToRelative(0f, 2.522f, -0.63f, 5.026f, -1.625f, 7.265f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.37f, -0.61f)
                curveToRelative(0.925f, -2.08f, 1.495f, -4.377f, 1.495f, -6.655f)
                curveToRelative(0f, -2.283f, -0.573f, -4.7f, -1.495f, -6.775f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.38f, -0.99f)
                moveToRelative(-4.35f, 2.174f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.006f, 0.336f)
                curveToRelative(0.781f, 1.562f, 1.16f, 3.48f, 1.16f, 5.255f)
                arcToRelative(12.5f, 12.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.15f, 5.234f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.362f, -0.628f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.15f, 12f)
                curveToRelative(0f, -1.586f, -0.342f, -3.267f, -1f, -4.585f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.335f, -1.006f)
                moveToRelative(-4.28f, 2.022f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.984f, 0.394f)
                curveToRelative(0.398f, 0.927f, 0.66f, 2.107f, 0.66f, 3.175f)
                curveToRelative(0f, 1.08f, -0.268f, 2.142f, -0.66f, 3.056f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.378f, -0.591f)
                curveToRelative(0.328f, -0.766f, 0.539f, -1.626f, 0.539f, -2.465f)
                curveToRelative(0f, -0.852f, -0.217f, -1.832f, -0.54f, -2.584f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.395f, -0.985f)
            }
        }.build()

        return _Contactless!!
    }

@Suppress("ObjectPropertyName")
private var _Contactless: ImageVector? = null
