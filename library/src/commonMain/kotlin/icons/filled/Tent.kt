package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Tent: ImageVector
    get() {
        if (_Tent != null) {
            return _Tent!!
        }
        _Tent = ImageVector.Builder(
            name = "Filled.Tent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.576f, 0.27f)
                curveToRelative(1.915f, 2.297f, 3.981f, 3.573f, 6.729f, 4.794f)
                lineToRelative(0.096f, 0.052f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.349f, 0.634f)
                verticalLineToRelative(9.25f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.25f)
                verticalLineTo(9.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.445f, -0.686f)
                lineToRelative(0.508f, -0.229f)
                curveTo(7.701f, 7.43f, 9.63f, 6.174f, 11.423f, 4.02f)
                lineToRelative(0.057f, -0.061f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3.75f)
                moveToRelative(0f, 10.085f)
                curveToRelative(-0.613f, 1.797f, -1.539f, 3.407f, -2.8f, 4.915f)
                horizontalLineToRelative(5.6f)
                curveToRelative(-1.261f, -1.508f, -2.187f, -3.118f, -2.8f, -4.915f)
            }
        }.build()

        return _Tent!!
    }

@Suppress("ObjectPropertyName")
private var _Tent: ImageVector? = null
