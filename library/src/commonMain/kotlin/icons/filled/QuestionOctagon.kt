package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.QuestionOctagon: ImageVector
    get() {
        if (_QuestionOctagon != null) {
            return _QuestionOctagon!!
        }
        _QuestionOctagon = ImageVector.Builder(
            name = "Filled.QuestionOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.937f, 2.25f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.9f, 0.158f)
                curveToRelative(-0.299f, 0.122f, -0.54f, 0.31f, -0.762f, 0.53f)
                lineTo(2.938f, 7.275f)
                curveToRelative(-0.213f, 0.214f, -0.4f, 0.45f, -0.525f, 0.748f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.163f, 0.914f)
                verticalLineToRelative(6.126f)
                curveToRelative(0f, 0.302f, 0.036f, 0.602f, 0.158f, 0.9f)
                reflectiveCurveToRelative(0.31f, 0.54f, 0.53f, 0.762f)
                lineToRelative(4.337f, 4.337f)
                curveToRelative(0.214f, 0.213f, 0.45f, 0.4f, 0.748f, 0.524f)
                curveToRelative(0.298f, 0.125f, 0.601f, 0.164f, 0.914f, 0.164f)
                horizontalLineToRelative(6.126f)
                curveToRelative(0.302f, 0f, 0.602f, -0.035f, 0.9f, -0.158f)
                curveToRelative(0.299f, -0.122f, 0.54f, -0.31f, 0.762f, -0.53f)
                lineToRelative(4.337f, -4.337f)
                curveToRelative(0.213f, -0.214f, 0.4f, -0.45f, 0.524f, -0.748f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.164f, -0.914f)
                verticalLineTo(8.937f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.158f, -0.9f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.53f, -0.762f)
                lineToRelative(-4.337f, -4.337f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.762f, -0.53f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.9f, -0.158f)
                close()
                moveTo(12f, 14.747f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(1.872f, -6.814f)
                curveToRelative(0.544f, 0.482f, 0.878f, 1.188f, 0.878f, 2.057f)
                curveToRelative(0f, 0.64f, -0.164f, 1.138f, -0.45f, 1.543f)
                curveToRelative(-0.256f, 0.365f, -0.588f, 0.614f, -0.823f, 0.79f)
                lineToRelative(-0.027f, 0.02f)
                curveToRelative(-0.263f, 0.198f, -0.416f, 0.32f, -0.524f, 0.474f)
                curveToRelative(-0.09f, 0.127f, -0.176f, 0.317f, -0.176f, 0.68f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -0.64f, 0.164f, -1.14f, 0.45f, -1.544f)
                curveToRelative(0.256f, -0.364f, 0.588f, -0.613f, 0.823f, -0.79f)
                lineToRelative(0.027f, -0.02f)
                curveToRelative(0.263f, -0.198f, 0.416f, -0.32f, 0.524f, -0.474f)
                curveToRelative(0.09f, -0.127f, 0.176f, -0.317f, 0.176f, -0.679f)
                curveToRelative(0f, -0.46f, -0.166f, -0.75f, -0.372f, -0.934f)
                arcToRelative(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.878f, -0.31f)
                curveToRelative(-0.34f, 0f, -0.657f, 0.114f, -0.877f, 0.31f)
                curveToRelative(-0.207f, 0.183f, -0.373f, 0.474f, -0.373f, 0.934f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -0.869f, 0.334f, -1.575f, 0.877f, -2.057f)
                arcTo(2.83f, 2.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7.246f)
                curveToRelative(0.66f, 0f, 1.343f, 0.218f, 1.872f, 0.687f)
            }
        }.build()

        return _QuestionOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _QuestionOctagon: ImageVector? = null
