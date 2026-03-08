package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Bowl: ImageVector
    get() {
        if (_Bowl != null) {
            return _Bowl!!
        }
        _Bowl = ImageVector.Builder(
            name = "Outline.Bowl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.017f, 21f)
                curveToRelative(0.555f, 0f, 1.005f, -0.448f, 1.005f, -1f)
                verticalLineToRelative(-0.45f)
                curveToRelative(0f, -0.307f, 0.164f, -0.563f, 0.433f, -0.715f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.944f, -1.471f)
                arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.595f, -5.366f)
                curveToRelative(0.061f, -0.549f, -0.395f, -0.998f, -0.95f, -0.998f)
                horizontalLineTo(3.956f)
                curveToRelative(-0.555f, 0f, -1.011f, 0.45f, -0.95f, 0.998f)
                arcTo(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.6f, 17.364f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.833f, 1.408f)
                curveToRelative(0.33f, 0.193f, 0.55f, 0.537f, 0.548f, 0.918f)
                verticalLineToRelative(0.307f)
                arcTo(1.003f, 1.003f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.986f, 21f)
                close()
                moveTo(6f, 5f)
                verticalLineToRelative(2f)
                moveToRelative(12f, -2f)
                verticalLineToRelative(2f)
                moveToRelative(-6f, -4f)
                verticalLineToRelative(4f)
            }
        }.build()

        return _Bowl!!
    }

@Suppress("ObjectPropertyName")
private var _Bowl: ImageVector? = null
