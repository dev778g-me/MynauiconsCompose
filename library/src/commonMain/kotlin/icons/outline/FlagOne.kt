package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FlagOne: ImageVector
    get() {
        if (_FlagOne != null) {
            return _FlagOne!!
        }
        _FlagOne = ImageVector.Builder(
            name = "Outline.FlagOne",
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
                moveToRelative(4.75f, 14f)
                lineToRelative(13.78f, -4.04f)
                curveToRelative(0.96f, -0.282f, 0.96f, -1.638f, 0f, -1.92f)
                lineTo(4.75f, 4f)
                moveToRelative(0f, 10f)
                verticalLineTo(4f)
                moveToRelative(0f, 10f)
                verticalLineToRelative(7f)
                moveToRelative(0f, -17f)
                verticalLineTo(3f)
            }
        }.build()

        return _FlagOne!!
    }

@Suppress("ObjectPropertyName")
private var _FlagOne: ImageVector? = null
