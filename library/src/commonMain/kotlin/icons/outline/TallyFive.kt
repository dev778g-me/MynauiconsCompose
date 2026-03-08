package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TallyFive: ImageVector
    get() {
        if (_TallyFive != null) {
            return _TallyFive!!
        }
        _TallyFive = ImageVector.Builder(
            name = "Outline.TallyFive",
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
                moveTo(4f, 4f)
                verticalLineToRelative(16f)
                moveTo(9.333f, 4f)
                verticalLineToRelative(16f)
                moveToRelative(5.334f, -16f)
                verticalLineToRelative(16f)
                moveTo(20f, 4f)
                verticalLineToRelative(16f)
                moveToRelative(1f, -17f)
                lineTo(3f, 21f)
            }
        }.build()

        return _TallyFive!!
    }

@Suppress("ObjectPropertyName")
private var _TallyFive: ImageVector? = null
