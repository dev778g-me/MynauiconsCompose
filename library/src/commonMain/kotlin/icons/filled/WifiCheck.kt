package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.WifiCheck: ImageVector
    get() {
        if (_WifiCheck != null) {
            return _WifiCheck!!
        }
        _WifiCheck = ImageVector.Builder(
            name = "Filled.WifiCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6.25f)
                curveToRelative(-3.415f, 0f, -6.827f, 1.26f, -9.484f, 3.777f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.032f, -1.089f)
                arcTo(15.25f, 15.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                moveToRelative(-7.53f, 7.18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                curveToRelative(4.159f, -4.16f, 10.901f, -4.16f, 15.06f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, 1.06f)
                arcToRelative(9.15f, 9.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.94f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 0f)
                moveToRelative(3f, 3.257f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                arcToRelative(6.407f, 6.407f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.06f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 1.06f)
                arcToRelative(4.907f, 4.907f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.94f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 0f)
                moveTo(12f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                moveToRelative(8.253f, -13.56f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.216f, -0.88f)
                lineTo(16.57f, 6.978f)
                lineTo(15.564f, 5.83f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.128f, 0.987f)
                lineToRelative(1.378f, 1.576f)
                arcToRelative(1.05f, 1.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.64f, -0.077f)
                close()
            }
        }.build()

        return _WifiCheck!!
    }

@Suppress("ObjectPropertyName")
private var _WifiCheck: ImageVector? = null
