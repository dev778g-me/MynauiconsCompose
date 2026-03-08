package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.SpinnerOne: ImageVector
    get() {
        if (_SpinnerOne != null) {
            return _SpinnerOne!!
        }
        _SpinnerOne = ImageVector.Builder(
            name = "Outline.SpinnerOne",
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
                moveTo(12f, 3f)
                verticalLineToRelative(3f)
                moveToRelative(0f, 15f)
                verticalLineToRelative(-3f)
                moveToRelative(-7.794f, -1.5f)
                lineTo(6.804f, 15f)
                moveTo(21f, 12f)
                horizontalLineToRelative(-3f)
                moveToRelative(-1.5f, 7.794f)
                lineTo(15f, 17.196f)
                moveTo(3f, 12f)
                horizontalLineToRelative(3f)
                moveToRelative(1.5f, -7.794f)
                lineTo(9f, 6.804f)
                moveToRelative(-1.5f, 12.99f)
                lineTo(9f, 17.196f)
                moveToRelative(10.794f, -0.696f)
                lineTo(17.196f, 15f)
                moveTo(4.206f, 7.5f)
                lineTo(6.804f, 9f)
            }
        }.build()

        return _SpinnerOne!!
    }

@Suppress("ObjectPropertyName")
private var _SpinnerOne: ImageVector? = null
