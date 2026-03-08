package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TypeUnderline: ImageVector
    get() {
        if (_TypeUnderline != null) {
            return _TypeUnderline!!
        }
        _TypeUnderline = ImageVector.Builder(
            name = "Outline.TypeUnderline",
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
                moveTo(6f, 3f)
                verticalLineToRelative(7.539f)
                curveToRelative(0f, 1.713f, 0.632f, 3.357f, 1.757f, 4.569f)
                reflectiveCurveTo(10.41f, 17f, 12f, 17f)
                reflectiveCurveToRelative(3.117f, -0.68f, 4.243f, -1.892f)
                curveTo(17.368f, 13.896f, 18f, 12.252f, 18f, 10.538f)
                verticalLineTo(3f)
                moveTo(4f, 21f)
                horizontalLineToRelative(16f)
            }
        }.build()

        return _TypeUnderline!!
    }

@Suppress("ObjectPropertyName")
private var _TypeUnderline: ImageVector? = null
