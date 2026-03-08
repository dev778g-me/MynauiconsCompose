package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FlaskConical: ImageVector
    get() {
        if (_FlaskConical != null) {
            return _FlaskConical!!
        }
        _FlaskConical = ImageVector.Builder(
            name = "Outline.FlaskConical",
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
                moveTo(9.894f, 3.5f)
                verticalLineToRelative(8f)
                lineToRelative(-3.66f, 3.965f)
                curveToRelative(-0.932f, 1.265f, -2.795f, 3.276f, -0.948f, 4.622f)
                curveToRelative(0.568f, 0.413f, 1.615f, 0.413f, 3.71f, 0.413f)
                horizontalLineToRelative(6.009f)
                curveToRelative(2.094f, 0f, 3.141f, 0f, 3.709f, -0.413f)
                curveToRelative(1.847f, -1.346f, -0.016f, -3.357f, -0.949f, -4.622f)
                lineToRelative(-3.66f, -3.965f)
                verticalLineToRelative(-8f)
                moveToRelative(-4.21f, 0f)
                horizontalLineToRelative(4.21f)
                moveToRelative(-4.21f, 0f)
                horizontalLineTo(8.84f)
                moveToRelative(5.265f, 0f)
                horizontalLineToRelative(1.053f)
            }
        }.build()

        return _FlaskConical!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskConical: ImageVector? = null
