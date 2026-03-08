package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Tv: ImageVector
    get() {
        if (_Tv != null) {
            return _Tv!!
        }
        _Tv = ImageVector.Builder(
            name = "Filled.Tv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.274f, 2.613f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.255f, 1.03f)
                lineTo(14.696f, 6.25f)
                horizontalLineTo(19f)
                curveToRelative(1.57f, 0f, 2.75f, 1.353f, 2.75f, 2.904f)
                verticalLineToRelative(9.692f)
                curveToRelative(0f, 1.55f, -1.18f, 2.904f, -2.75f, 2.904f)
                horizontalLineTo(5f)
                curveToRelative(-1.57f, 0f, -2.75f, -1.353f, -2.75f, -2.904f)
                verticalLineTo(9.154f)
                curveTo(2.25f, 7.604f, 3.43f, 6.25f, 5f, 6.25f)
                horizontalLineToRelative(3.995f)
                lineTo(4.96f, 3.629f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.817f, -1.258f)
                lineToRelative(5.972f, 3.879f)
                horizontalLineToRelative(0.042f)
                lineToRelative(6.453f, -3.892f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.03f, 0.255f)
            }
        }.build()

        return _Tv!!
    }

@Suppress("ObjectPropertyName")
private var _Tv: ImageVector? = null
