package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BaggageClaim: ImageVector
    get() {
        if (_BaggageClaim != null) {
            return _BaggageClaim!!
        }
        _BaggageClaim = ImageVector.Builder(
            name = "Filled.BaggageClaim",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 14.25f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.75f, -1.75f)
                verticalLineToRelative(-5f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 5.75f)
                horizontalLineToRelative(-2.31f)
                curveToRelative(-0.127f, -0.785f, -0.457f, -1.436f, -0.936f, -1.924f)
                arcToRelative(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.254f, -0.94f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.254f, 0.941f)
                curveToRelative(-0.478f, 0.487f, -0.807f, 1.139f, -0.935f, 1.923f)
                lineTo(6f, 5.75f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.25f, 7.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                close()
                moveTo(11.5f, 4.387f)
                curveToRelative(0.435f, 0f, 0.864f, 0.165f, 1.184f, 0.49f)
                curveToRelative(0.2f, 0.204f, 0.375f, 0.49f, 0.475f, 0.873f)
                lineTo(9.842f, 5.75f)
                curveToRelative(0.1f, -0.382f, 0.274f, -0.667f, 0.474f, -0.871f)
                curveToRelative(0.32f, -0.326f, 0.749f, -0.492f, 1.184f, -0.492f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 21.25f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.447f, -4f)
                horizontalLineTo(19f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, -2.75f)
                verticalLineToRelative(-11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(11f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 15.75f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.553f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.895f, 0f)
                horizontalLineToRelative(4.105f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.447f, 4f)
            }
        }.build()

        return _BaggageClaim!!
    }

@Suppress("ObjectPropertyName")
private var _BaggageClaim: ImageVector? = null
