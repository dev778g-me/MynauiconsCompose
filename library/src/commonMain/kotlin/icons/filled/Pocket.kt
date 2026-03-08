package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Pocket: ImageVector
    get() {
        if (_Pocket != null) {
            return _Pocket!!
        }
        _Pocket = ImageVector.Builder(
            name = "Filled.Pocket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.984f, 3.036f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.8f, 2.25f)
                horizontalLineToRelative(14.4f)
                curveToRelative(0.688f, 0f, 1.34f, 0.287f, 1.816f, 0.786f)
                curveToRelative(0.474f, 0.497f, 0.734f, 1.164f, 0.734f, 1.853f)
                verticalLineToRelative(6.667f)
                curveToRelative(0f, 2.692f, -1.019f, 5.28f, -2.843f, 7.195f)
                curveToRelative(-1.826f, 1.916f, -4.31f, 2.999f, -6.907f, 2.999f)
                arcToRelative(9.4f, 9.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.743f, -0.781f)
                arcToRelative(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.164f, -2.218f)
                curveTo(3.27f, 16.837f, 2.25f, 14.248f, 2.25f, 11.556f)
                verticalLineTo(4.889f)
                curveToRelative(0f, -0.689f, 0.26f, -1.356f, 0.734f, -1.853f)
                moveTo(9.53f, 9.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 0f)
                lineToRelative(3f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, -1.06f)
                lineTo(12f, 12.19f)
                close()
            }
        }.build()

        return _Pocket!!
    }

@Suppress("ObjectPropertyName")
private var _Pocket: ImageVector? = null
