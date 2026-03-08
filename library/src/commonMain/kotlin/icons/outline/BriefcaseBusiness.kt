package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.BriefcaseBusiness: ImageVector
    get() {
        if (_BriefcaseBusiness != null) {
            return _BriefcaseBusiness!!
        }
        _BriefcaseBusiness = ImageVector.Builder(
            name = "Outline.BriefcaseBusiness",
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
                moveTo(15f, 6.6f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.545f, -0.456f, -0.998f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.545f, 0f, -1.002f, 0.456f, -1f, 1f)
                verticalLineToRelative(2.6f)
                moveToRelative(0.52f, 8.4f)
                curveToRelative(-2.3f, -0.251f, -4.223f, -0.705f, -6.241f, -2f)
                moveToRelative(11.33f, 2f)
                curveToRelative(2.302f, -0.251f, 4.094f, -0.705f, 6.112f, -2f)
                moveTo(8.308f, 21f)
                horizontalLineToRelative(7.384f)
                curveToRelative(3.71f, 0f, 4.375f, -1.449f, 4.569f, -3.213f)
                lineToRelative(0.692f, -7.2f)
                curveToRelative(0.25f, -2.196f, -0.397f, -3.987f, -4.338f, -3.987f)
                horizontalLineToRelative(-9.23f)
                curveToRelative(-3.941f, 0f, -4.587f, 1.791f, -4.338f, 3.987f)
                lineToRelative(0.692f, 7.2f)
                curveTo(3.933f, 19.551f, 4.598f, 21f, 8.308f, 21f)
                moveToRelative(5.003f, -7.501f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.653f, 0.002f, -1.789f, 3f, 0f, 3f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.784f, 0f, 1.68f, -3f, 0f, -3f)
            }
        }.build()

        return _BriefcaseBusiness!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseBusiness: ImageVector? = null
